package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperBlank: ImageVector? = null

val Icons.Ts.ToiletPaperBlank: ImageVector
    get() = _ToiletPaperBlank ?: UXIcon(name = "ToiletPaperBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                lineTo(6.5f, 0f)
                curveTo(3.98f, 0f, 2f, 3.08f, 2f, 7f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                verticalLineToRelative(1f)
                lineTo(13.5f, 24f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(3f)
                curveToRelative(2.24f, 0f, 4f, -3.51f, 4f, -8f)
                reflectiveCurveTo(22.24f, 0f, 20f, 0f)
                close()
                moveTo(16f, 8f)
                verticalLineToRelative(12.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(2.23f, 23f)
                curveToRelative(0.48f, -0.53f, 0.77f, -1.23f, 0.77f, -2f)
                lineTo(3f, 7f)
                curveToRelative(0f, -3.25f, 1.6f, -6f, 3.5f, -6f)
                horizontalLineToRelative(11.54f)
                curveToRelative(-1.22f, 1.35f, -2.04f, 3.95f, -2.04f, 7f)
                close()
                moveTo(17f, 15f)
                verticalLineToRelative(-1.66f)
                curveToRelative(0.29f, 0.66f, 0.64f, 1.22f, 1.03f, 1.66f)
                horizontalLineToRelative(-1.03f)
                close()
                moveTo(20f, 15f)
                curveToRelative(-1.42f, 0f, -3f, -2.88f, -3f, -7f)
                reflectiveCurveToRelative(1.58f, -7f, 3f, -7f)
                reflectiveCurveToRelative(3f, 2.88f, 3f, 7f)
                reflectiveCurveToRelative(-1.58f, 7f, -3f, 7f)
                close()
                moveTo(21f, 8f)
                curveToRelative(0f, 0.83f, -0.45f, 1.5f, -1f, 1.5f)
                reflectiveCurveToRelative(-1f, -0.67f, -1f, -1.5f)
                reflectiveCurveToRelative(0.45f, -1.5f, 1f, -1.5f)
                reflectiveCurveToRelative(1f, 0.67f, 1f, 1.5f)
                close()
            }
        }.also { _ToiletPaperBlank = it}
