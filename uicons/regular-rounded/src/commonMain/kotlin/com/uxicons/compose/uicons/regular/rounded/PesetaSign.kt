package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PesetaSign: ImageVector? = null

val Icons.Rr.PesetaSign: ImageVector
    get() = _PesetaSign ?: UXIcon(name = "PesetaSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 7f)
                horizontalLineToRelative(-2.06f)
                curveToRelative(-0.49f, -3.94f, -3.87f, -7f, -7.94f, -7f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(2f)
                lineTo(2f, 7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(6f)
                curveToRelative(4.07f, 0f, 7.44f, -3.06f, 7.94f, -7f)
                horizontalLineToRelative(2.06f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(6f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                curveToRelative(2.97f, 0f, 5.44f, 2.17f, 5.92f, 5f)
                lineTo(6f, 7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(12f, 14f)
                lineTo(6f, 14f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(11.92f)
                curveToRelative(-0.48f, 2.83f, -2.95f, 5f, -5.92f, 5f)
                close()
            }
        }.also { _PesetaSign = it}
