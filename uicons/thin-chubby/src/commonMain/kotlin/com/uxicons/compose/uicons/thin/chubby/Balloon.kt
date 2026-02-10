package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Balloon: ImageVector? = null

val Icons.Tc.Balloon: ImageVector
    get() = _Balloon ?: UXIcon(name = "Balloon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 9.94f)
                curveToRelative(0f, -6.27f, -2.69f, -8.94f, -9f, -8.94f)
                reflectiveCurveToRelative(-9f, 2.67f, -9f, 8.94f)
                curveToRelative(0f, 5.73f, 2.72f, 9.82f, 6.95f, 10.82f)
                curveToRelative(-0.18f, 0.22f, -0.33f, 0.49f, -0.41f, 0.85f)
                curveToRelative(-0.18f, 0.69f, 0.41f, 1.41f, 1.12f, 1.39f)
                horizontalLineToRelative(2.7f)
                curveToRelative(0.71f, 0.02f, 1.3f, -0.7f, 1.12f, -1.39f)
                curveToRelative(-0.09f, -0.36f, -0.23f, -0.63f, -0.41f, -0.85f)
                curveToRelative(4.23f, -0.99f, 6.94f, -5.09f, 6.94f, -10.82f)
                close()
                moveTo(13.5f, 21.84f)
                curveToRelative(0.01f, 0.1f, -0.04f, 0.15f, -0.15f, 0.16f)
                horizontalLineToRelative(-2.7f)
                curveToRelative(-0.11f, -0.01f, -0.15f, -0.06f, -0.15f, -0.16f)
                curveToRelative(0.1f, -0.42f, 0.3f, -0.84f, 1.5f, -0.84f)
                reflectiveCurveToRelative(1.4f, 0.41f, 1.5f, 0.84f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.79f, 0f, -8f, -4.04f, -8f, -10.05f)
                curveToRelative(0f, -5.79f, 2.17f, -7.94f, 8f, -7.94f)
                reflectiveCurveToRelative(8f, 2.15f, 8f, 7.94f)
                curveToRelative(0f, 6.01f, -3.21f, 10.05f, -8f, 10.05f)
                close()
                moveTo(17f, 10.5f)
                curveToRelative(0f, 0.72f, -0.26f, 2.7f, -1.06f, 4.23f)
                curveToRelative(-0.13f, 0.25f, -0.43f, 0.34f, -0.67f, 0.21f)
                curveToRelative(-0.24f, -0.13f, -0.34f, -0.43f, -0.21f, -0.67f)
                curveToRelative(0.71f, -1.36f, 0.94f, -3.16f, 0.94f, -3.77f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _Balloon = it}
