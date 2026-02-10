package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperSlash: ImageVector? = null

val Icons.Bs.ToiletPaperSlash: ImageVector
    get() = _ToiletPaperSlash ?: UXIcon(name = "ToiletPaperSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 16f)
                horizontalLineToRelative(1f)
                curveToRelative(2.21f, 0f, 4f, -3.58f, 4f, -8f)
                reflectiveCurveTo(22.21f, 0f, 20f, 0f)
                lineTo(7.5f, 0f)
                curveToRelative(-1.34f, 0f, -2.58f, 0.65f, -3.55f, 1.83f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineToRelative(21.8f, 21.8f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-4.96f, -4.96f)
                verticalLineToRelative(-0.88f)
                close()
                moveTo(21f, 8f)
                curveToRelative(0f, 1.66f, -0.45f, 3f, -1f, 3f)
                reflectiveCurveToRelative(-1f, -1.34f, -1f, -3f)
                reflectiveCurveToRelative(0.45f, -3f, 1f, -3f)
                reflectiveCurveToRelative(1f, 1.34f, 1f, 3f)
                close()
                moveTo(7.5f, 3f)
                horizontalLineToRelative(9.38f)
                curveToRelative(-0.55f, 1.37f, -0.88f, 3.11f, -0.88f, 5f)
                verticalLineToRelative(5.88f)
                lineTo(6.09f, 3.97f)
                curveToRelative(0.43f, -0.61f, 0.94f, -0.97f, 1.41f, -0.97f)
                close()
                moveTo(15.59f, 20.53f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(-0.82f, 0.83f, -1.95f, 1.34f, -3.21f, 1.34f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -0.34f, 0.01f, -0.68f, 0.04f, -1.01f)
                lineToRelative(2.96f, 2.96f)
                verticalLineToRelative(9.05f)
                curveToRelative(0f, 0.71f, -0.15f, 1.39f, -0.42f, 2f)
                horizontalLineToRelative(9.92f)
                curveToRelative(0.43f, 0f, 0.81f, -0.18f, 1.08f, -0.47f)
                close()
            }
        }.also { _ToiletPaperSlash = it}
