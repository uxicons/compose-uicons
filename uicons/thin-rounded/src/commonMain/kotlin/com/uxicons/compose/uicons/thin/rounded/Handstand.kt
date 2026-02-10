package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Handstand: ImageVector? = null

val Icons.Tr.Handstand: ImageVector
    get() = _Handstand ?: UXIcon(name = "Handstand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 17f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(19.44f, 23.25f)
                lineTo(15f, 15.37f)
                verticalLineToRelative(-5.87f)
                curveToRelative(0f, -0.81f, -0.4f, -1.53f, -1.0f, -1.99f)
                curveToRelative(0f, -0.0f, 0.0f, -0.01f, 0.0f, -0.01f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6.55f)
                curveToRelative(-0.16f, -0.03f, -0.33f, -0.05f, -0.5f, -0.05f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.17f, 0f, -0.34f, 0.02f, -0.5f, 0.05f)
                verticalLineToRelative(-6.55f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(7f)
                reflectiveCurveToRelative(0.0f, 0.01f, 0.0f, 0.01f)
                curveToRelative(-0.6f, 0.46f, -1.0f, 1.18f, -1.0f, 1.99f)
                verticalLineToRelative(5.87f)
                lineToRelative(-4.44f, 7.88f)
                curveToRelative(-0.14f, 0.24f, -0.05f, 0.55f, 0.19f, 0.68f)
                curveToRelative(0.24f, 0.13f, 0.54f, 0.05f, 0.68f, -0.19f)
                lineToRelative(4.36f, -7.75f)
                horizontalLineToRelative(4.42f)
                lineToRelative(4.36f, 7.75f)
                curveToRelative(0.14f, 0.24f, 0.45f, 0.33f, 0.68f, 0.19f)
                curveToRelative(0.24f, -0.14f, 0.33f, -0.44f, 0.19f, -0.68f)
                close()
                moveTo(14f, 15f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Handstand = it}
