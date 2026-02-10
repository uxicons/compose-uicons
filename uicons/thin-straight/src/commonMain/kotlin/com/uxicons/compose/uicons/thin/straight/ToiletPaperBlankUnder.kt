package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperBlankUnder: ImageVector? = null

val Icons.Ts.ToiletPaperBlankUnder: ImageVector
    get() = _ToiletPaperBlankUnder ?: UXIcon(name = "ToiletPaperBlankUnder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 21f)
                lineTo(22f, 7f)
                curveToRelative(-0.24f, -4.0f, -1.93f, -7f, -4f, -7f)
                lineTo(4.5f, 0f)
                curveTo(1.98f, 0f, 0f, 3.51f, 0f, 8f)
                reflectiveCurveToRelative(1.98f, 8f, 4.5f, 8f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13.5f)
                verticalLineToRelative(-1f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                close()
                moveTo(21f, 8f)
                curveToRelative(0f, 4.12f, -1.58f, 7f, -3f, 7f)
                reflectiveCurveToRelative(-3f, -2.88f, -3f, -7f)
                reflectiveCurveToRelative(1.58f, -7f, 3f, -7f)
                reflectiveCurveToRelative(3f, 2.88f, 3f, 7f)
                close()
                moveTo(1f, 8f)
                curveToRelative(0f, -3.79f, 1.6f, -7f, 3.5f, -7f)
                horizontalLineToRelative(11.54f)
                curveToRelative(-1.22f, 1.35f, -2.04f, 3.95f, -2.04f, 7f)
                reflectiveCurveToRelative(0.81f, 5.65f, 2.04f, 7f)
                lineTo(4.5f, 15f)
                curveToRelative(-1.9f, 0f, -3.5f, -3.21f, -3.5f, -7f)
                close()
                moveTo(10.5f, 23f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(10f)
                curveToRelative(1.21f, 0f, 2.27f, -1.02f, 3f, -2.66f)
                verticalLineToRelative(7.66f)
                curveToRelative(0f, 0.77f, 0.29f, 1.47f, 0.77f, 2f)
                horizontalLineToRelative(-11.27f)
                close()
                moveTo(17f, 8f)
                curveToRelative(0f, -0.83f, 0.45f, -1.5f, 1f, -1.5f)
                reflectiveCurveToRelative(1f, 0.67f, 1f, 1.5f)
                reflectiveCurveToRelative(-0.45f, 1.5f, -1f, 1.5f)
                reflectiveCurveToRelative(-1f, -0.67f, -1f, -1.5f)
                close()
            }
        }.also { _ToiletPaperBlankUnder = it}
