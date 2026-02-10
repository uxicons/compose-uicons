package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseChimney: ImageVector? = null

val Icons.Rr.HouseChimney: ImageVector
    get() = _HouseChimney ?: UXIcon(name = "HouseChimney") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 5.72f)
                lineTo(22f, 2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.37f)
                lineTo(14.8f, 0.85f)
                curveToRelative(-1.7f, -1.15f, -3.9f, -1.15f, -5.59f, 0f)
                lineTo(2.2f, 5.58f)
                curveToRelative(-1.38f, 0.93f, -2.2f, 2.48f, -2.2f, 4.14f)
                verticalLineToRelative(9.28f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(9f, 15f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 9.72f)
                curveToRelative(0f, -1.58f, -0.74f, -3.06f, -2f, -4f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 9.72f)
                curveToRelative(0f, -1.0f, 0.49f, -1.93f, 1.32f, -2.49f)
                lineTo(10.32f, 2.51f)
                curveToRelative(1.02f, -0.69f, 2.34f, -0.69f, 3.35f, 0f)
                lineToRelative(7f, 4.72f)
                curveToRelative(0.83f, 0.56f, 1.32f, 1.49f, 1.32f, 2.49f)
                verticalLineToRelative(9.28f)
                close()
            }
        }.also { _HouseChimney = it}
