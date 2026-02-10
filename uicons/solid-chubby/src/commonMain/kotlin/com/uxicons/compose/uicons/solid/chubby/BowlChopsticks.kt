package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlChopsticks: ImageVector? = null

val Icons.Sc.BowlChopsticks: ImageVector
    get() = _BowlChopsticks ?: UXIcon(name = "BowlChopsticks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 13.23f)
                verticalLineToRelative(2.27f)
                curveToRelative(0f, 4.14f, -3.36f, 7.5f, -7.5f, 7.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                verticalLineToRelative(-2.27f)
                curveToRelative(0f, -0.42f, 0.27f, -0.8f, 0.67f, -0.94f)
                curveToRelative(0.15f, -0.05f, 3.74f, -1.29f, 10.33f, -1.29f)
                reflectiveCurveToRelative(10.18f, 1.23f, 10.33f, 1.29f)
                curveToRelative(0.4f, 0.14f, 0.67f, 0.52f, 0.67f, 0.94f)
                close()
                moveTo(4.5f, 9.5f)
                curveToRelative(5.58f, -0.64f, 11.24f, -0.68f, 16.83f, -0.01f)
                curveToRelative(0.82f, 0.11f, 1.57f, -0.49f, 1.67f, -1.31f)
                curveToRelative(0.1f, -0.82f, -0.49f, -1.57f, -1.31f, -1.67f)
                curveToRelative(-5.76f, -0.68f, -11.6f, -0.68f, -17.35f, 0f)
                curveToRelative(-0.82f, 0.1f, -1.41f, 0.84f, -1.31f, 1.67f)
                curveToRelative(0.09f, 0.76f, 0.74f, 1.32f, 1.49f, 1.32f)
                close()
                moveTo(4.51f, 5.58f)
                curveToRelative(5.73f, -1.3f, 11.55f, -1.54f, 17.0f, -1.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-5.52f, 0f, -11.4f, 0.12f, -17.35f, 1.54f)
                curveToRelative(-0.81f, 0.19f, -1.3f, 1.0f, -1.11f, 1.81f)
                curveToRelative(0.17f, 0.69f, 0.78f, 1.15f, 1.46f, 1.15f)
                close()
            }
        }.also { _BowlChopsticks = it}
