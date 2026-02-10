package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lemon: ImageVector? = null

val Icons.Rs.Lemon: ImageVector
    get() = _Lemon ?: UXIcon(name = "Lemon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.81f, 24f)
                arcToRelative(15.9f, 15.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.86f, -0.72f)
                arcTo(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.88f, 23.12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.16f, -4.07f)
                curveTo(-0.58f, 15.1f, -0.45f, 8.2f, 3.88f, 3.88f)
                reflectiveCurveTo(15.1f, -0.58f, 19.05f, 0.72f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.07f, 0.16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.16f, 4.07f)
                curveToRelative(1.3f, 3.96f, 1.17f, 10.86f, -3.15f, 15.18f)
                arcTo(14.51f, 14.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.81f, 24f)
                close()
                moveTo(14.21f, 2f)
                arcTo(12.59f, 12.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.29f, 5.29f)
                curveTo(1.42f, 9.16f, 1.52f, 15.71f, 2.8f, 18.93f)
                lineToRelative(0.24f, 0.61f)
                lineToRelative(-0.75f, 0.75f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.41f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineToRelative(0.75f, -0.75f)
                lineToRelative(0.61f, 0.24f)
                curveToRelative(3.21f, 1.28f, 9.77f, 1.38f, 13.64f, -2.49f)
                reflectiveCurveTo(22.48f, 8.29f, 21.2f, 5.07f)
                lineToRelative(-0.24f, -0.61f)
                lineToRelative(0.75f, -0.75f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.41f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineToRelative(-0.75f, 0.75f)
                lineTo(18.93f, 2.8f)
                arcTo(13.16f, 13.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.21f, 2f)
                close()
                moveTo(17f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 12f)
                close()
                moveTo(15f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 9f)
                close()
                moveTo(19f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9f)
                close()
            }
        }.also { _Lemon = it}
