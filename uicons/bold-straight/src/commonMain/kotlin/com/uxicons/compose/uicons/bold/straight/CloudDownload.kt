package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudDownload: ImageVector? = null

val Icons.Bs.CloudDownload: ImageVector
    get() = _CloudDownload ?: UXIcon(name = "CloudDownload") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.77f, 23f)
                horizontalLineToRelative(-3.97f)
                arcToRelative(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.8f, -5.78f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.72f, -4.92f)
                arcToRelative(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.37f, -11.3f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.88f, 6f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.02f, 7.85f)
                arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.3f, 2.15f)
                horizontalLineToRelative(-3.19f)
                arcToRelative(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.49f, -2.15f)
                arcToRelative(5.17f, 5.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.49f, -5.1f)
                lineToRelative(-1.14f, -0.15f)
                lineToRelative(-0.15f, -1.14f)
                arcToRelative(5.18f, 5.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.13f, -4.46f)
                arcToRelative(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.06f, 5.03f)
                arcToRelative(5.09f, 5.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.02f, 3.06f)
                lineToRelative(1.33f, 1.79f)
                lineToRelative(-2.16f, 0.56f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.22f, 2.79f)
                arcToRelative(2.79f, 2.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.8f, 2.77f)
                horizontalLineToRelative(0.94f)
                close()
                moveTo(17f, 20f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                lineToRelative(3.75f, 3.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineToRelative(3.84f, -3.71f)
                close()
            }
        }.also { _CloudDownload = it}
