package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperXmark: ImageVector? = null

val Icons.Bs.ToiletPaperXmark: ImageVector
    get() = _ToiletPaperXmark ?: UXIcon(name = "ToiletPaperXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 19f)
                lineTo(22f, 8f)
                curveToRelative(0f, -3.85f, -1.25f, -8f, -4f, -8f)
                lineTo(5.5f, 0f)
                curveTo(2.42f, 0f, 0f, 3.51f, 0f, 8f)
                curveToRelative(0f, 4.24f, 2.16f, 7.61f, 5f, 7.96f)
                verticalLineToRelative(3.54f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                close()
                moveTo(19f, 8f)
                curveToRelative(0f, 2.51f, -0.58f, 4.2f, -1f, 4.82f)
                curveToRelative(-0.42f, -0.62f, -1f, -2.31f, -1f, -4.82f)
                reflectiveCurveToRelative(0.58f, -4.2f, 1f, -4.82f)
                curveToRelative(0.42f, 0.62f, 1f, 2.31f, 1f, 4.82f)
                close()
                moveTo(3f, 8f)
                curveToRelative(0f, -2.86f, 1.32f, -5f, 2.5f, -5f)
                lineTo(14.8f, 3f)
                curveToRelative(-0.54f, 1.45f, -0.8f, 3.25f, -0.8f, 5f)
                reflectiveCurveToRelative(0.26f, 3.55f, 0.8f, 5f)
                lineTo(5.5f, 13f)
                curveToRelative(-1.18f, 0f, -2.5f, -2.14f, -2.5f, -5f)
                close()
                moveTo(8f, 19.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(10f)
                curveToRelative(0.36f, 0f, 0.69f, -0.07f, 1f, -0.21f)
                verticalLineToRelative(3.21f)
                curveToRelative(0f, 0.71f, 0.15f, 1.39f, 0.42f, 2f)
                lineTo(9.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(5.29f, 9.79f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(-1.41f, -1.41f)
                close()
            }
        }.also { _ToiletPaperXmark = it}
