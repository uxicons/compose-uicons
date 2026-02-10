package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FacePensive: ImageVector? = null

val Icons.Ts.FacePensive: ImageVector
    get() = _FacePensive ?: UXIcon(name = "FacePensive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 17f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1f)
                close()
                moveTo(10.11f, 12.08f)
                curveToRelative(-0.85f, 0.85f, -1.74f, 0.98f, -2.35f, 0.94f)
                curveToRelative(-0.76f, -0.05f, -1.5f, -0.39f, -2.04f, -0.92f)
                lineToRelative(-0.7f, 0.71f)
                curveToRelative(0.71f, 0.7f, 1.69f, 1.14f, 2.68f, 1.21f)
                curveToRelative(0.09f, 0.01f, 0.17f, 0.01f, 0.27f, 0.01f)
                curveToRelative(0.8f, 0f, 1.87f, -0.24f, 2.87f, -1.25f)
                lineToRelative(-0.71f, -0.7f)
                close()
                moveTo(16.32f, 13.0f)
                curveToRelative(-0.6f, 0.04f, -1.51f, -0.09f, -2.35f, -0.94f)
                lineToRelative(-0.71f, 0.7f)
                curveToRelative(0.99f, 1.01f, 2.07f, 1.25f, 2.86f, 1.25f)
                curveToRelative(0.09f, 0f, 0.18f, -0.0f, 0.26f, -0.01f)
                curveToRelative(0.99f, -0.07f, 1.97f, -0.51f, 2.67f, -1.21f)
                lineToRelative(-0.7f, -0.71f)
                curveToRelative(-0.54f, 0.53f, -1.28f, 0.87f, -2.04f, 0.92f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                close()
                moveTo(9.17f, 5.77f)
                lineToRelative(-0.84f, -0.54f)
                curveToRelative(-0.83f, 1.31f, -2.14f, 2.39f, -3.68f, 3.05f)
                lineToRelative(0.39f, 0.92f)
                curveToRelative(1.75f, -0.75f, 3.18f, -1.94f, 4.13f, -3.44f)
                close()
                moveTo(15.67f, 5.22f)
                lineToRelative(-0.83f, 0.55f)
                curveToRelative(0.98f, 1.49f, 2.44f, 2.67f, 4.2f, 3.43f)
                lineToRelative(0.39f, -0.92f)
                curveToRelative(-1.58f, -0.67f, -2.88f, -1.73f, -3.76f, -3.06f)
                close()
            }
        }.also { _FacePensive = it}
