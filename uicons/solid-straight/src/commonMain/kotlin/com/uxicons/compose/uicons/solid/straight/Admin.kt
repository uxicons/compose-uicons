package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Admin: ImageVector? = null

val Icons.Ss.Admin: ImageVector
    get() = _Admin ?: UXIcon(name = "Admin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 11f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveTo(19f, 22f)
                verticalLineToRelative(2f)
                lineTo(5f, 24f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(6f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(22.04f, 15.74f)
                lineToRelative(-1.09f, 1.68f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-3.4f, -2.16f, -3.4f, -2.16f)
                curveToRelative(0.91f, -1.18f, 1.46f, -2.65f, 1.46f, -4.26f)
                curveToRelative(0f, -3.87f, -3.13f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.13f, -7f, 7f)
                curveToRelative(0f, 1.6f, 0.55f, 3.08f, 1.46f, 4.26f)
                lineToRelative(-3.4f, 2.16f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-1.09f, -1.68f, -1.09f, -1.68f)
                lineToRelative(1.78f, -1.16f)
                curveToRelative(-0.48f, -1.1f, -0.75f, -2.31f, -0.75f, -3.58f)
                curveToRelative(0f, -1.45f, 0.35f, -2.82f, 0.97f, -4.03f)
                lineToRelative(-1.73f, -1.13f)
                lineToRelative(1.09f, -1.68f)
                lineToRelative(1.73f, 1.12f)
                curveToRelative(1.45f, -1.76f, 3.56f, -2.96f, 5.95f, -3.23f)
                lineTo(11.0f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.06f)
                curveToRelative(2.39f, 0.27f, 4.5f, 1.46f, 5.95f, 3.23f)
                lineToRelative(1.73f, -1.12f)
                lineToRelative(1.09f, 1.68f)
                lineToRelative(-1.73f, 1.13f)
                curveToRelative(0.61f, 1.22f, 0.97f, 2.58f, 0.97f, 4.03f)
                curveToRelative(0f, 1.27f, -0.27f, 2.48f, -0.75f, 3.58f)
                lineToRelative(1.78f, 1.16f)
                close()
            }
        }.also { _Admin = it}
