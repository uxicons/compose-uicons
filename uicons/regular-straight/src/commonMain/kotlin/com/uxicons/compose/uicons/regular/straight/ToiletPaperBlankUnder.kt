package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperBlankUnder: ImageVector? = null

val Icons.Rs.ToiletPaperBlankUnder: ImageVector
    get() = _ToiletPaperBlankUnder ?: UXIcon(name = "ToiletPaperBlankUnder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 20f)
                lineToRelative(-0.03f, -12.5f)
                curveToRelative(-0.28f, -4.28f, -2.36f, -7.5f, -4.97f, -7.5f)
                lineTo(5f, 0f)
                curveTo(2.2f, 0f, 0f, 3.73f, 0f, 8.5f)
                reflectiveCurveToRelative(2.2f, 8.5f, 5f, 8.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                close()
                moveTo(20f, 8.5f)
                curveToRelative(0f, 3.83f, -1.58f, 6.5f, -3f, 6.5f)
                reflectiveCurveToRelative(-3f, -2.67f, -3f, -6.5f)
                reflectiveCurveToRelative(1.58f, -6.5f, 3f, -6.5f)
                reflectiveCurveToRelative(3f, 2.67f, 3f, 6.5f)
                close()
                moveTo(2f, 8.5f)
                curveToRelative(0f, -3.83f, 1.58f, -6.5f, 3f, -6.5f)
                horizontalLineToRelative(8.74f)
                curveToRelative(-1.07f, 1.55f, -1.75f, 3.87f, -1.75f, 6.5f)
                reflectiveCurveToRelative(0.67f, 4.95f, 1.75f, 6.5f)
                lineTo(5f, 15f)
                curveToRelative(-1.42f, 0f, -3f, -2.67f, -3f, -6.5f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7f)
                curveToRelative(1.14f, 0f, 2.17f, -0.61f, 3f, -1.66f)
                verticalLineToRelative(4.66f)
                curveToRelative(0f, 0.73f, 0.2f, 1.41f, 0.54f, 2f)
                horizontalLineToRelative(-8.54f)
                close()
                moveTo(16f, 8.5f)
                curveToRelative(0f, -0.83f, 0.45f, -1.5f, 1f, -1.5f)
                reflectiveCurveToRelative(1f, 0.67f, 1f, 1.5f)
                reflectiveCurveToRelative(-0.45f, 1.5f, -1f, 1.5f)
                reflectiveCurveToRelative(-1f, -0.67f, -1f, -1.5f)
                close()
            }
        }.also { _ToiletPaperBlankUnder = it}
