package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateUtensils: ImageVector? = null

val Icons.Ss.PlateUtensils: ImageVector
    get() = _PlateUtensils ?: UXIcon(name = "PlateUtensils") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(14f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                lineTo(18f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(22f, 0f)
                horizontalLineToRelative(2f)
                close()
                moveTo(12f, 9f)
                verticalLineToRelative(-3f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(1.54f, 0f, 2.94f, -0.59f, 4f, -1.54f)
                verticalLineToRelative(-2.56f)
                curveToRelative(-2.28f, -0.47f, -4f, -2.48f, -4f, -4.9f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                lineTo(12f, 0f)
                curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
                reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
                curveToRelative(1.41f, 0f, 2.75f, -0.25f, 4f, -0.7f)
                verticalLineToRelative(-4.38f)
                curveToRelative(-1.18f, 0.68f, -2.54f, 1.08f, -4f, 1.08f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                close()
            }
        }.also { _PlateUtensils = it}
