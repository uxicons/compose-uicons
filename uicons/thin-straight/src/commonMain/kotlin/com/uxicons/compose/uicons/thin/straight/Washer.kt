package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Washer: ImageVector? = null

val Icons.Ts.Washer: ImageVector
    get() = _Washer ?: UXIcon(name = "Washer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(7f, 4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(22f, 2.5f)
                verticalLineToRelative(21.5f)
                lineTo(2f, 24f)
                lineTo(2f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(21f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(4.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 2.5f)
                close()
                moveTo(18f, 14f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(16.89f, 15.02f)
                curveToRelative(-0.48f, 0.25f, -1.13f, 0.48f, -1.9f, 0.48f)
                curveToRelative(-1.63f, 0f, -3.21f, -1.04f, -3.28f, -1.08f)
                curveToRelative(-0.01f, -0.01f, -1.4f, -0.92f, -2.72f, -0.92f)
                curveToRelative(-0.94f, 0f, -1.67f, 0.47f, -1.98f, 0.71f)
                curveToRelative(0.11f, 2.66f, 2.29f, 4.79f, 4.98f, 4.79f)
                curveToRelative(2.41f, 0f, 4.42f, -1.71f, 4.89f, -3.98f)
                close()
                moveTo(16.98f, 13.79f)
                curveToRelative(-0.11f, -2.66f, -2.29f, -4.79f, -4.98f, -4.79f)
                curveToRelative(-2.41f, 0f, -4.42f, 1.71f, -4.89f, 3.98f)
                curveToRelative(0.48f, -0.25f, 1.13f, -0.48f, 1.9f, -0.48f)
                curveToRelative(1.63f, 0f, 3.21f, 1.04f, 3.28f, 1.08f)
                curveToRelative(0.01f, 0.01f, 1.4f, 0.92f, 2.72f, 0.92f)
                curveToRelative(0.94f, 0f, 1.67f, -0.47f, 1.98f, -0.71f)
                close()
            }
        }.also { _Washer = it}
