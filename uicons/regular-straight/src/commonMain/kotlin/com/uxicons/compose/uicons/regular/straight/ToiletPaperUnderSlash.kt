package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperUnderSlash: ImageVector? = null

val Icons.Rs.ToiletPaperUnderSlash: ImageVector
    get() = _ToiletPaperUnderSlash ?: UXIcon(name = "ToiletPaperUnderSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 8.5f)
                curveToRelative(0f, -0.83f, 0.45f, -1.5f, 1f, -1.5f)
                reflectiveCurveToRelative(1f, 0.67f, 1f, 1.5f)
                reflectiveCurveToRelative(-0.45f, 1.5f, -1f, 1.5f)
                reflectiveCurveToRelative(-1f, -0.67f, -1f, -1.5f)
                close()
                moveTo(23.95f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.02f, 1.43f)
                lineTo(1.43f, 0.02f)
                lineToRelative(1.07f, 1.07f)
                curveToRelative(0.74f, -0.71f, 1.61f, -1.09f, 2.5f, -1.09f)
                horizontalLineToRelative(12f)
                curveToRelative(2.6f, 0f, 4.68f, 3.22f, 4.97f, 7.5f)
                lineToRelative(0.03f, 13.09f)
                lineToRelative(1.95f, 1.95f)
                close()
                moveTo(20f, 15.35f)
                curveToRelative(-0.53f, 0.67f, -1.15f, 1.16f, -1.82f, 1.43f)
                lineToRelative(1.82f, 1.82f)
                verticalLineToRelative(-3.24f)
                close()
                moveTo(17f, 2f)
                curveToRelative(-1.42f, 0f, -3f, 2.67f, -3f, 6.5f)
                curveToRelative(0f, 2.62f, 0.74f, 4.69f, 1.66f, 5.75f)
                curveToRelative(0f, 0f, 0.73f, 0.76f, 1.34f, 0.76f)
                curveToRelative(1.42f, 0f, 3f, -2.67f, 3f, -6.5f)
                reflectiveCurveToRelative(-1.58f, -6.5f, -3f, -6.5f)
                close()
                moveTo(3.92f, 2.5f)
                lineToRelative(8.26f, 8.26f)
                curveToRelative(-0.11f, -0.72f, -0.17f, -1.47f, -0.17f, -2.26f)
                curveToRelative(0f, -2.63f, 0.67f, -4.95f, 1.75f, -6.5f)
                lineTo(5f, 2f)
                curveToRelative(-0.42f, 0f, -0.79f, 0.23f, -1.08f, 0.5f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.76f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(-5.76f)
                curveToRelative(-1.42f, 0f, -3f, -2.67f, -3f, -6.5f)
                curveToRelative(0f, -0.72f, 0.06f, -1.42f, 0.17f, -2.08f)
                lineToRelative(-1.68f, -1.68f)
                curveToRelative(-0.32f, 1.15f, -0.5f, 2.43f, -0.5f, 3.76f)
                curveToRelative(0f, 4.77f, 2.2f, 8.5f, 5f, 8.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(7.76f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(-5.76f)
                close()
            }
        }.also { _ToiletPaperUnderSlash = it}
