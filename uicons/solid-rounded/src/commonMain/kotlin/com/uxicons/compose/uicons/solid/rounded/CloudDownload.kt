package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudDownload: ImageVector? = null

val Icons.Sr.CloudDownload: ImageVector
    get() = _CloudDownload ?: UXIcon(name = "CloudDownload") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.36f, 7.36f)
                arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.72f, -0.73f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.49f, 0.84f)
                arcToRelative(7.65f, 7.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, 5.18f)
                arcToRelative(5.45f, 5.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.89f, 5.65f)
                arcToRelative(5.84f, 5.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.63f, 4.7f)
                horizontalLineToRelative(9.1f)
                curveToRelative(5.07f, 0f, 8.85f, -3.03f, 9.19f, -7.36f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.62f, -8.28f)
                close()
                moveTo(18.66f, 18.75f)
                lineTo(17.08f, 20.16f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.06f, 0.84f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.14f, -0.88f)
                lineToRelative(-1.54f, -1.37f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.33f, -1.49f)
                lineToRelative(1.33f, 1.19f)
                verticalLineToRelative(-7.44f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(7.45f)
                lineToRelative(1.33f, -1.19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.33f, 1.49f)
                close()
            }
        }.also { _CloudDownload = it}
