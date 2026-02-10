package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperUnderSlash: ImageVector? = null

val Icons.Ss.ToiletPaperUnderSlash: ImageVector
    get() = _ToiletPaperUnderSlash ?: UXIcon(name = "ToiletPaperUnderSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.95f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.02f, 1.43f)
                lineTo(1.43f, 0.02f)
                lineToRelative(1.05f, 1.05f)
                curveToRelative(0.73f, -0.69f, 1.59f, -1.07f, 2.52f, -1.07f)
                horizontalLineToRelative(10.87f)
                curveToRelative(-1.27f, 2.01f, -1.87f, 5.26f, -1.87f, 8.5f)
                curveToRelative(0f, 1.54f, 0.14f, 3.09f, 0.41f, 4.5f)
                lineToRelative(5.77f, 5.77f)
                curveToRelative(0.71f, -0.29f, 1.31f, -0.83f, 1.81f, -1.57f)
                verticalLineToRelative(2.79f)
                curveToRelative(0f, 0.26f, 0.05f, 0.5f, 0.14f, 0.73f)
                lineToRelative(1.81f, 1.81f)
                close()
                moveTo(16f, 8.5f)
                curveToRelative(0f, -4.69f, 1.34f, -8.5f, 3f, -8.5f)
                reflectiveCurveToRelative(3f, 3.81f, 3f, 8.5f)
                reflectiveCurveToRelative(-1.34f, 8.5f, -3f, 8.5f)
                reflectiveCurveToRelative(-3f, -3.81f, -3f, -8.5f)
                close()
                moveTo(18f, 8.5f)
                curveToRelative(0f, 1.1f, 0.45f, 2f, 1f, 2f)
                reflectiveCurveToRelative(1f, -0.9f, 1f, -2f)
                reflectiveCurveToRelative(-0.45f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.9f, -1f, 2f)
                close()
                moveTo(0.48f, 4.7f)
                curveToRelative(-0.31f, 1.12f, -0.48f, 2.4f, -0.48f, 3.8f)
                curveToRelative(0f, 5f, 2.2f, 8.5f, 5f, 8.5f)
                horizontalLineToRelative(7.78f)
                lineTo(0.48f, 4.7f)
                close()
                moveTo(8f, 19f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(8.78f)
                lineToRelative(-5f, -5f)
                horizontalLineToRelative(-6.78f)
                close()
            }
        }.also { _ToiletPaperUnderSlash = it}
