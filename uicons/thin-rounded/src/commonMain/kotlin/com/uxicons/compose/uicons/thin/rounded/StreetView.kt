package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StreetView: ImageVector? = null

val Icons.Tr.StreetView: ImageVector
    get() = _StreetView ?: UXIcon(name = "StreetView") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(12f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15f, 20.5f)
                verticalLineToRelative(-5.55f)
                curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
                verticalLineToRelative(5.55f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                close()
                moveTo(24f, 19.75f)
                curveToRelative(0f, -1.68f, -2.34f, -3.06f, -6.41f, -3.79f)
                curveToRelative(-0.28f, -0.05f, -0.53f, 0.13f, -0.58f, 0.41f)
                reflectiveCurveToRelative(0.13f, 0.53f, 0.4f, 0.58f)
                curveToRelative(3.84f, 0.68f, 5.59f, 1.93f, 5.59f, 2.8f)
                curveToRelative(0f, 1.54f, -4.52f, 3.25f, -11f, 3.25f)
                reflectiveCurveToRelative(-11f, -1.71f, -11f, -3.25f)
                curveToRelative(0f, -0.87f, 1.75f, -2.12f, 5.59f, -2.8f)
                curveToRelative(0.27f, -0.05f, 0.45f, -0.31f, 0.4f, -0.58f)
                curveToRelative(-0.05f, -0.27f, -0.3f, -0.46f, -0.58f, -0.41f)
                curveToRelative(-4.08f, 0.72f, -6.41f, 2.1f, -6.41f, 3.79f)
                curveToRelative(0f, 2.76f, 6.18f, 4.25f, 12f, 4.25f)
                reflectiveCurveToRelative(12f, -1.49f, 12f, -4.25f)
                close()
            }
        }.also { _StreetView = it}
