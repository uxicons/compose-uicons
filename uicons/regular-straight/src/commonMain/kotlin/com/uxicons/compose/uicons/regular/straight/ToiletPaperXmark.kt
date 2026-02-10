package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperXmark: ImageVector? = null

val Icons.Rs.ToiletPaperXmark: ImageVector
    get() = _ToiletPaperXmark ?: UXIcon(name = "ToiletPaperXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 8.5f)
                curveToRelative(0f, -0.83f, 0.45f, -1.5f, 1f, -1.5f)
                reflectiveCurveToRelative(1f, 0.67f, 1f, 1.5f)
                reflectiveCurveToRelative(-0.45f, 1.5f, -1f, 1.5f)
                reflectiveCurveToRelative(-1f, -0.67f, -1f, -1.5f)
                close()
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                lineTo(12f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.75f)
                curveToRelative(-3.04f, 0f, -5.25f, -3.58f, -5.25f, -8.5f)
                reflectiveCurveTo(2.21f, 0f, 5.25f, 0f)
                horizontalLineToRelative(11.75f)
                curveToRelative(2.8f, 0f, 5f, 3.73f, 5f, 8.5f)
                verticalLineToRelative(11.5f)
                curveToRelative(0f, 0.95f, 1.05f, 2f, 2f, 2f)
                close()
                moveTo(17f, 2f)
                curveToRelative(-1.42f, 0f, -3f, 2.67f, -3f, 6.5f)
                reflectiveCurveToRelative(1.58f, 6.5f, 3f, 6.5f)
                reflectiveCurveToRelative(3f, -2.67f, 3f, -6.5f)
                reflectiveCurveToRelative(-1.58f, -6.5f, -3f, -6.5f)
                close()
                moveTo(13.75f, 15f)
                curveToRelative(-1.07f, -1.55f, -1.75f, -3.86f, -1.75f, -6.5f)
                reflectiveCurveToRelative(0.67f, -4.95f, 1.75f, -6.5f)
                lineTo(5.25f, 2f)
                curveToRelative(-1.82f, 0f, -3.25f, 2.85f, -3.25f, 6.5f)
                reflectiveCurveToRelative(1.43f, 6.5f, 3.25f, 6.5f)
                lineTo(13.75f, 15f)
                close()
                moveTo(12f, 22f)
                horizontalLineToRelative(8.63f)
                curveToRelative(-0.39f, -0.61f, -0.63f, -1.29f, -0.63f, -2f)
                verticalLineToRelative(-4.67f)
                curveToRelative(-0.83f, 1.05f, -1.86f, 1.67f, -3f, 1.67f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveTo(8.41f, 8.5f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.79f, -1.79f)
                close()
            }
        }.also { _ToiletPaperXmark = it}
