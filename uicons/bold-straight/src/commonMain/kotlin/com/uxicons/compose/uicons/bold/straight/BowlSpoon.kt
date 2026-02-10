package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlSpoon: ImageVector? = null

val Icons.Bs.BowlSpoon: ImageVector
    get() = _BowlSpoon ?: UXIcon(name = "BowlSpoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.58f, 11f)
                lineTo(3.42f, 11f)
                curveToRelative(-1.01f, 0f, -1.96f, 0.44f, -2.62f, 1.22f)
                curveToRelative(-0.65f, 0.77f, -0.92f, 1.77f, -0.76f, 2.75f)
                curveToRelative(0.65f, 3.81f, 3.54f, 7.03f, 7.8f, 9.04f)
                horizontalLineToRelative(8.31f)
                curveToRelative(4.26f, -2.01f, 7.15f, -5.23f, 7.8f, -9.04f)
                curveToRelative(0.17f, -0.98f, -0.11f, -1.98f, -0.76f, -2.75f)
                curveToRelative(-0.65f, -0.77f, -1.6f, -1.22f, -2.62f, -1.22f)
                close()
                moveTo(21.0f, 14.46f)
                curveToRelative(-0.57f, 3.39f, -3.25f, 5.41f, -5.52f, 6.54f)
                horizontalLineToRelative(-6.95f)
                curveToRelative(-2.27f, -1.13f, -4.95f, -3.15f, -5.52f, -6.54f)
                curveToRelative(-0.02f, -0.14f, 0.04f, -0.25f, 0.09f, -0.31f)
                curveToRelative(0.05f, -0.06f, 0.15f, -0.15f, 0.32f, -0.15f)
                horizontalLineToRelative(17.16f)
                curveToRelative(0.17f, 0f, 0.28f, 0.1f, 0.32f, 0.15f)
                curveToRelative(0.05f, 0.06f, 0.11f, 0.17f, 0.09f, 0.31f)
                close()
                moveTo(10.74f, 3f)
                curveTo(10.12f, 1.23f, 8.44f, -0.04f, 6.46f, -0.04f)
                curveTo(4.18f, -0.04f, 0f, 1.68f, 0f, 4.5f)
                reflectiveCurveToRelative(4.18f, 4.54f, 6.46f, 4.54f)
                curveToRelative(1.98f, 0f, 3.67f, -1.27f, 4.29f, -3.04f)
                horizontalLineToRelative(13.26f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-13.26f)
                close()
                moveTo(6.46f, 6.04f)
                curveToRelative(-1.26f, 0f, -3.29f, -1.01f, -3.46f, -1.5f)
                curveToRelative(0.17f, -0.57f, 2.2f, -1.58f, 3.46f, -1.58f)
                curveToRelative(0.85f, 0f, 1.54f, 0.69f, 1.54f, 1.54f)
                reflectiveCurveToRelative(-0.69f, 1.54f, -1.54f, 1.54f)
                close()
            }
        }.also { _BowlSpoon = it}
