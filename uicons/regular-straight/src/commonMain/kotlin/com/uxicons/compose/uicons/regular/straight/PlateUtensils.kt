package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateUtensils: ImageVector? = null

val Icons.Rs.PlateUtensils: ImageVector
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
                moveTo(2f, 12f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                lineTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(1.4f, 0f, 2.75f, -0.26f, 4f, -0.7f)
                verticalLineToRelative(-2.14f)
                curveToRelative(-1.23f, 0.54f, -2.58f, 0.84f, -4f, 0.84f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                close()
                moveTo(6f, 12f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                verticalLineToRelative(-2f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                curveToRelative(1.46f, 0f, 2.82f, -0.4f, 4f, -1.08f)
                verticalLineToRelative(-2.46f)
                curveToRelative(-1.06f, 0.95f, -2.46f, 1.54f, -4f, 1.54f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                close()
            }
        }.also { _PlateUtensils = it}
