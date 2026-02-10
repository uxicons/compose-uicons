package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CassetteVhs: ImageVector? = null

val Icons.Rs.CassetteVhs: ImageVector
    get() = _CassetteVhs ?: UXIcon(name = "CassetteVhs") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                lineTo(3f, 3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                lineTo(24f, 21f)
                lineTo(24f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 19f)
                lineTo(2f, 7f)
                lineTo(22f, 7f)
                verticalLineToRelative(12f)
                lineTo(2f, 19f)
                close()
                moveTo(18.45f, 9f)
                lineTo(5.55f, 9f)
                lineToRelative(-0.3f, 0.34f)
                curveToRelative(-0.05f, 0.06f, -1.25f, 1.43f, -1.25f, 3.66f)
                reflectiveCurveToRelative(1.2f, 3.61f, 1.25f, 3.66f)
                lineToRelative(0.3f, 0.34f)
                horizontalLineToRelative(12.9f)
                lineToRelative(0.3f, -0.34f)
                curveToRelative(0.05f, -0.06f, 1.25f, -1.43f, 1.25f, -3.66f)
                reflectiveCurveToRelative(-1.2f, -3.61f, -1.25f, -3.66f)
                lineToRelative(-0.3f, -0.34f)
                close()
                moveTo(14f, 11f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                close()
                moveTo(6f, 13f)
                curveToRelative(0f, -0.93f, 0.3f, -1.62f, 0.52f, -2f)
                horizontalLineToRelative(1.48f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1.48f)
                curveToRelative(-0.22f, -0.38f, -0.52f, -1.07f, -0.52f, -2f)
                close()
                moveTo(17.48f, 15f)
                horizontalLineToRelative(-1.48f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1.48f)
                curveToRelative(0.22f, 0.38f, 0.52f, 1.07f, 0.52f, 2f)
                reflectiveCurveToRelative(-0.3f, 1.62f, -0.52f, 2f)
                close()
            }
        }.also { _CassetteVhs = it}
