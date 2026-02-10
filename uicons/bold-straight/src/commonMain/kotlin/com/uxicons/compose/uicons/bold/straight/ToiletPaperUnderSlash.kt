package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperUnderSlash: ImageVector? = null

val Icons.Bs.ToiletPaperUnderSlash: ImageVector
    get() = _ToiletPaperUnderSlash ?: UXIcon(name = "ToiletPaperUnderSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.04f, 21f)
                lineToRelative(3.0f, 3f)
                horizontalLineToRelative(-9.53f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-3.54f)
                curveToRelative(-2.84f, -0.36f, -5f, -3.72f, -5f, -7.96f)
                curveToRelative(0f, -0.94f, 0.11f, -1.86f, 0.32f, -2.73f)
                lineToRelative(2.68f, 2.68f)
                curveToRelative(0f, 0.01f, -0.0f, 0.03f, -0.0f, 0.04f)
                curveToRelative(0f, 2.86f, 1.32f, 5f, 2.5f, 5f)
                horizontalLineToRelative(2.54f)
                lineToRelative(3.0f, 3f)
                horizontalLineToRelative(-3.04f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.54f)
                close()
                moveTo(24f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.14f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineToRelative(0.82f, 0.82f)
                curveToRelative(0.77f, -0.56f, 1.63f, -0.86f, 2.52f, -0.86f)
                horizontalLineToRelative(12.5f)
                curveToRelative(2.21f, 0f, 4f, 3.58f, 4f, 8f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveTo(14f, 8f)
                curveToRelative(0f, -1.89f, 0.33f, -3.63f, 0.88f, -5f)
                lineTo(5.5f, 3f)
                curveToRelative(-0.11f, 0f, -0.22f, 0.02f, -0.33f, 0.05f)
                lineToRelative(9.57f, 9.58f)
                curveToRelative(-0.47f, -1.31f, -0.75f, -2.91f, -0.75f, -4.64f)
                close()
                moveTo(19f, 8f)
                curveToRelative(0f, -1.93f, -0.45f, -3.5f, -1f, -3.5f)
                reflectiveCurveToRelative(-1f, 1.57f, -1f, 3.5f)
                reflectiveCurveToRelative(0.45f, 3.5f, 1f, 3.5f)
                reflectiveCurveToRelative(1f, -1.57f, 1f, -3.5f)
                close()
            }
        }.also { _ToiletPaperUnderSlash = it}
