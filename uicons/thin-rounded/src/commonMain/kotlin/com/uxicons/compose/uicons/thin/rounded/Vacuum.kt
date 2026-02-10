package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vacuum: ImageVector? = null

val Icons.Tr.Vacuum: ImageVector
    get() = _Vacuum ?: UXIcon(name = "Vacuum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 16f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.75f)
                curveToRelative(0f, -3.47f, -2.63f, -6.33f, -6f, -6.71f)
                verticalLineToRelative(-1.7f)
                curveToRelative(0f, -2.94f, -2.4f, -5.34f, -5.34f, -5.34f)
                curveToRelative(-2.66f, 0f, -4.88f, 1.91f, -5.28f, 4.54f)
                lineToRelative(-2.68f, 17.61f)
                curveToRelative(-0.07f, 0.49f, -0.49f, 0.85f, -0.99f, 0.85f)
                lineTo(0.5f, 23f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.21f)
                curveToRelative(0.99f, 0f, 1.83f, -0.71f, 1.98f, -1.7f)
                lineToRelative(2.68f, -17.61f)
                curveToRelative(0.33f, -2.14f, 2.13f, -3.69f, 4.29f, -3.69f)
                curveToRelative(2.39f, 0f, 4.34f, 1.95f, 4.34f, 4.34f)
                verticalLineToRelative(1.66f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(5.42f)
                curveToRelative(1.73f, -0.21f, 3.08f, -1.72f, 3.08f, -3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 0.98f, 0.41f, 1.86f, 1.06f, 2.5f)
                horizontalLineToRelative(-2.56f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.75f)
                curveToRelative(3.17f, 0f, 5.75f, 2.58f, 5.75f, 5.75f)
                verticalLineToRelative(1.75f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(18f, 20.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _Vacuum = it}
