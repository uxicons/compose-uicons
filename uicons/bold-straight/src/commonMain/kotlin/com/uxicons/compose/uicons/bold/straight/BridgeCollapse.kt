package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BridgeCollapse: ImageVector? = null

val Icons.Bs.BridgeCollapse: ImageVector
    get() = _BridgeCollapse ?: UXIcon(name = "BridgeCollapse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21f)
                verticalLineToRelative(3f)
                curveToRelative(-1.16f, 0f, -2.2f, -0.45f, -3f, -1.17f)
                curveToRelative(-0.8f, 0.72f, -1.84f, 1.17f, -3f, 1.17f)
                reflectiveCurveToRelative(-2.2f, -0.45f, -3f, -1.17f)
                curveToRelative(-0.8f, 0.72f, -1.84f, 1.17f, -3f, 1.17f)
                reflectiveCurveToRelative(-2.2f, -0.45f, -3f, -1.17f)
                curveToRelative(-0.8f, 0.72f, -1.84f, 1.17f, -3f, 1.17f)
                reflectiveCurveToRelative(-2.2f, -0.45f, -3f, -1.17f)
                curveToRelative(-0.8f, 0.72f, -1.84f, 1.17f, -3f, 1.17f)
                verticalLineToRelative(-3f)
                curveToRelative(0.65f, 0f, 1.2f, -0.42f, 1.41f, -1f)
                horizontalLineToRelative(3.18f)
                curveToRelative(0.21f, 0.58f, 0.76f, 1f, 1.41f, 1f)
                reflectiveCurveToRelative(1.2f, -0.42f, 1.41f, -1f)
                horizontalLineToRelative(3.18f)
                curveToRelative(0.21f, 0.58f, 0.76f, 1f, 1.41f, 1f)
                reflectiveCurveToRelative(1.2f, -0.42f, 1.41f, -1f)
                horizontalLineToRelative(3.18f)
                curveToRelative(0.21f, 0.58f, 0.76f, 1f, 1.41f, 1f)
                reflectiveCurveToRelative(1.2f, -0.42f, 1.41f, -1f)
                horizontalLineToRelative(3.18f)
                curveToRelative(0.21f, 0.58f, 0.76f, 1f, 1.41f, 1f)
                close()
                moveTo(5f, 8.63f)
                lineTo(11.55f, 2.14f)
                lineTo(9.45f, 0.01f)
                lineTo(2.38f, 7f)
                lineTo(0f, 7f)
                verticalLineToRelative(11f)
                lineTo(5f, 18f)
                lineTo(5f, 8.63f)
                close()
                moveTo(21.62f, 7f)
                lineTo(14.55f, 0.01f)
                lineToRelative(-2.11f, 2.13f)
                lineToRelative(6.55f, 6.49f)
                verticalLineToRelative(9.37f)
                horizontalLineToRelative(5f)
                lineTo(24f, 7f)
                horizontalLineToRelative(-2.38f)
                close()
            }
        }.also { _BridgeCollapse = it}
