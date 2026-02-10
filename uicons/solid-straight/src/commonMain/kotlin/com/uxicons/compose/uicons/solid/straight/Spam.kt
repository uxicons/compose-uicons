package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spam: ImageVector? = null

val Icons.Ss.Spam: ImageVector
    get() = _Spam ?: UXIcon(name = "Spam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(21.54f, 8.12f)
                lineTo(20.12f, 9.54f)
                lineTo(18.0f, 7.41f)
                lineTo(15.88f, 9.54f)
                lineTo(14.47f, 8.12f)
                lineTo(16.59f, 6f)
                lineTo(14.47f, 3.88f)
                lineTo(15.88f, 2.46f)
                lineTo(18.0f, 4.59f)
                lineTo(20.12f, 2.46f)
                lineTo(21.54f, 3.88f)
                lineTo(19.41f, 6f)
                close()
                moveTo(9.88f, 17.12f)
                lineTo(3f, 10.24f)
                verticalLineToRelative(-7.24f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6.73f)
                curveToRelative(-1.67f, 1.47f, -2.73f, 3.61f, -2.73f, 6f)
                curveToRelative(0f, 4.17f, 3.21f, 7.6f, 7.28f, 7.96f)
                lineToRelative(-3.16f, 3.16f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.13f, -4.24f, 0f)
                close()
                moveTo(23.9f, 11.38f)
                curveToRelative(0.06f, 0.28f, 0.1f, 0.56f, 0.1f, 0.85f)
                verticalLineToRelative(11.77f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-11.77f)
                curveToRelative(0.0f, -0.61f, 0.16f, -1.2f, 0.42f, -1.74f)
                lineToRelative(8.05f, 8.05f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.46f)
                lineToRelative(4.93f, -4.93f)
                curveToRelative(1.33f, -0.43f, 2.51f, -1.21f, 3.44f, -2.22f)
                close()
            }
        }.also { _Spam = it}
