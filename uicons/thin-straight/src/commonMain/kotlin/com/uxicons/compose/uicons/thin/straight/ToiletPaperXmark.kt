package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperXmark: ImageVector? = null

val Icons.Ts.ToiletPaperXmark: ImageVector
    get() = _ToiletPaperXmark ?: UXIcon(name = "ToiletPaperXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 8f)
                curveToRelative(0f, -0.83f, 0.45f, -1.5f, 1f, -1.5f)
                reflectiveCurveToRelative(1f, 0.67f, 1f, 1.5f)
                reflectiveCurveToRelative(-0.45f, 1.5f, -1f, 1.5f)
                reflectiveCurveToRelative(-1f, -0.67f, -1f, -1.5f)
                close()
                moveTo(24f, 23f)
                verticalLineToRelative(1f)
                lineTo(10.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-2.25f)
                curveTo(2.0f, 16f, 0f, 12.64f, 0f, 8f)
                reflectiveCurveTo(2.0f, 0f, 4.75f, 0f)
                horizontalLineToRelative(12.75f)
                lineTo(17.5f, 0.07f)
                curveToRelative(0.16f, -0.04f, 0.33f, -0.07f, 0.5f, -0.07f)
                curveToRelative(2.24f, 0f, 4f, 3.51f, 4f, 8f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.22f, 0.79f, 2f, 2f, 2f)
                close()
                moveTo(18f, 1f)
                curveToRelative(-1.42f, 0f, -3f, 2.88f, -3f, 7f)
                reflectiveCurveToRelative(1.58f, 7f, 3f, 7f)
                reflectiveCurveToRelative(3f, -2.88f, 3f, -7f)
                reflectiveCurveToRelative(-1.58f, -7f, -3f, -7f)
                close()
                moveTo(4.75f, 15f)
                horizontalLineToRelative(11.29f)
                curveToRelative(-1.23f, -1.35f, -2.04f, -3.95f, -2.04f, -7f)
                reflectiveCurveToRelative(0.81f, -5.65f, 2.04f, -7f)
                lineTo(4.75f, 1f)
                curveToRelative(-2.14f, 0f, -3.75f, 3.01f, -3.75f, 7f)
                reflectiveCurveToRelative(1.61f, 7f, 3.75f, 7f)
                close()
                moveTo(10.5f, 23f)
                horizontalLineToRelative(11.21f)
                curveToRelative(-0.44f, -0.52f, -0.71f, -1.2f, -0.71f, -2f)
                verticalLineToRelative(-7.67f)
                curveToRelative(-0.73f, 1.64f, -1.79f, 2.67f, -3f, 2.67f)
                lineTo(8f, 16f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(10.65f, 4.65f)
                lineToRelative(-2.65f, 2.65f)
                lineToRelative(-2.65f, -2.65f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(2.65f, 2.65f)
                lineToRelative(-2.65f, 2.65f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(2.65f, -2.65f)
                lineToRelative(2.65f, 2.65f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-2.65f, -2.65f)
                lineToRelative(2.65f, -2.65f)
                lineToRelative(-0.71f, -0.71f)
                close()
            }
        }.also { _ToiletPaperXmark = it}
