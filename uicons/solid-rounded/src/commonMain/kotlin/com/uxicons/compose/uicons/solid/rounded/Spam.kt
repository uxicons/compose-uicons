package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spam: ImageVector? = null

val Icons.Sr.Spam: ImageVector
    get() = _Spam ?: UXIcon(name = "Spam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(20.71f, 7.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-1.29f, -1.29f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.29f, -1.29f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.29f, 1.29f)
                lineToRelative(1.29f, -1.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-1.29f, 1.29f)
                close()
                moveTo(9.88f, 17.12f)
                lineTo(3f, 10.24f)
                verticalLineToRelative(-6.24f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(5.72f)
                curveToRelative(-1.67f, 1.47f, -2.72f, 3.61f, -2.72f, 6f)
                curveToRelative(0f, 4.17f, 3.2f, 7.6f, 7.28f, 7.96f)
                lineToRelative(-3.16f, 3.16f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.13f, -4.24f, 0f)
                close()
                moveTo(23.83f, 11.47f)
                curveToRelative(0.11f, 0.4f, 0.17f, 0.82f, 0.17f, 1.24f)
                verticalLineToRelative(6.29f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-14f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6.29f)
                curveToRelative(0f, -0.75f, 0.18f, -1.47f, 0.5f, -2.14f)
                lineToRelative(7.96f, 7.97f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.46f)
                lineToRelative(4.92f, -4.92f)
                curveToRelative(1.3f, -0.42f, 2.45f, -1.17f, 3.37f, -2.14f)
                close()
            }
        }.also { _Spam = it}
