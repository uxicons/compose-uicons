package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PointerLoading: ImageVector? = null

val Icons.Ts.PointerLoading: ImageVector
    get() = _PointerLoading ?: UXIcon(name = "PointerLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 2.56f)
                curveToRelative(-0.46f, -0.6f, -1.33f, -0.75f, -1.93f, -0.3f)
                lineTo(9.8f, 12.53f)
                lineToRelative(6.0f, 0.67f)
                lineToRelative(-3.7f, 6.9f)
                lineToRelative(3.34f, 1.67f)
                lineToRelative(3.8f, -7.07f)
                lineToRelative(4.76f, 4.44f)
                lineTo(24f, 3.42f)
                curveToRelative(0f, -0.3f, -0.1f, -0.6f, -0.29f, -0.85f)
                close()
                moveTo(23f, 16.85f)
                lineToRelative(-4.03f, -3.76f)
                lineToRelative(-3.95f, 7.36f)
                lineToRelative(-1.55f, -0.78f)
                lineToRelative(3.91f, -7.3f)
                lineToRelative(-5.17f, -0.58f)
                lineTo(22.41f, 3.04f)
                curveToRelative(0.1f, -0.08f, 0.36f, -0.06f, 0.5f, 0.13f)
                curveToRelative(0.05f, 0.07f, 0.08f, 0.16f, 0.08f, 0.25f)
                verticalLineToRelative(13.44f)
                close()
                moveTo(2f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(6f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(10f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _PointerLoading = it}
