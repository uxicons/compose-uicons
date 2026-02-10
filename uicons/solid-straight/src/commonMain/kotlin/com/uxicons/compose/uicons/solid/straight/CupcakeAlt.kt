package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupcakeAlt: ImageVector? = null

val Icons.Ss.CupcakeAlt: ImageVector
    get() = _CupcakeAlt ?: UXIcon(name = "CupcakeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 14f)
                lineTo(2.5f, 14f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-2f)
                lineTo(5f, 7f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(6f)
                curveToRelative(0.75f, -0.75f, 1f, -1.5f, 1f, -3f)
                curveToRelative(1.69f, 0f, 3.37f, 1.13f, 3.85f, 3f)
                horizontalLineToRelative(3.15f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(2.81f, 16f)
                lineToRelative(0.88f, 5.48f)
                curveToRelative(0.23f, 1.46f, 1.48f, 2.52f, 2.96f, 2.52f)
                horizontalLineToRelative(10.7f)
                curveToRelative(1.48f, 0f, 2.73f, -1.06f, 2.96f, -2.52f)
                lineToRelative(0.88f, -5.48f)
                lineTo(2.81f, 16f)
                close()
            }
        }.also { _CupcakeAlt = it}
