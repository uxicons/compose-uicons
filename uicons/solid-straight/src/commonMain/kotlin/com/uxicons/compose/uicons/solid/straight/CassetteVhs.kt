package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CassetteVhs: ImageVector? = null

val Icons.Ss.CassetteVhs: ImageVector
    get() = _CassetteVhs ?: UXIcon(name = "CassetteVhs") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 7f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                lineTo(0f, 7f)
                close()
                moveTo(8f, 13f)
                horizontalLineToRelative(-1.48f)
                curveToRelative(-0.22f, 0.38f, -0.52f, 1.07f, -0.52f, 2f)
                reflectiveCurveToRelative(0.3f, 1.62f, 0.52f, 2f)
                horizontalLineToRelative(1.48f)
                verticalLineToRelative(-4f)
                close()
                moveTo(10f, 17f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                close()
                moveTo(16f, 13f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1.48f)
                curveToRelative(0.22f, -0.38f, 0.52f, -1.07f, 0.52f, -2f)
                reflectiveCurveToRelative(-0.3f, -1.62f, -0.52f, -2f)
                horizontalLineToRelative(-1.48f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(12f)
                lineTo(0f, 21f)
                lineTo(0f, 9f)
                lineTo(24f, 9f)
                close()
                moveTo(20f, 15f)
                curveToRelative(0f, -2.23f, -1.2f, -3.61f, -1.25f, -3.66f)
                lineToRelative(-0.3f, -0.34f)
                lineTo(5.55f, 11f)
                lineToRelative(-0.3f, 0.34f)
                curveToRelative(-0.05f, 0.06f, -1.25f, 1.43f, -1.25f, 3.66f)
                reflectiveCurveToRelative(1.2f, 3.61f, 1.25f, 3.66f)
                lineToRelative(0.3f, 0.34f)
                horizontalLineToRelative(12.9f)
                lineToRelative(0.3f, -0.34f)
                curveToRelative(0.05f, -0.06f, 1.25f, -1.43f, 1.25f, -3.66f)
                close()
            }
        }.also { _CassetteVhs = it}
