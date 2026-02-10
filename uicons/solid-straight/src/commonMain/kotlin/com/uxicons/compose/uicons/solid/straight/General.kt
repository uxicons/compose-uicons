package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _General: ImageVector? = null

val Icons.Ss.General: ImageVector
    get() = _General ?: UXIcon(name = "General") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 6.05f)
                verticalLineToRelative(0.95f)
                reflectiveCurveToRelative(2f, 1f, 6f, 1f)
                reflectiveCurveToRelative(6f, -1f, 6f, -1f)
                verticalLineToRelative(-0.98f)
                curveToRelative(1.22f, -0.56f, 1.96f, -1.39f, 1.96f, -2.52f)
                curveToRelative(0f, -2.5f, -3.58f, -3.5f, -8f, -3.5f)
                reflectiveCurveTo(3.96f, 1f, 3.96f, 3.5f)
                curveToRelative(0f, 1.16f, 0.78f, 1.99f, 2.04f, 2.55f)
                close()
                moveTo(9.5f, 3f)
                horizontalLineToRelative(1.81f)
                lineToRelative(0.49f, -1.88f)
                horizontalLineToRelative(0.4f)
                lineToRelative(0.49f, 1.88f)
                horizontalLineToRelative(1.8f)
                verticalLineToRelative(0.38f)
                lineToRelative(-1.38f, 0.8f)
                lineToRelative(0.55f, 1.68f)
                lineToRelative(-0.31f, 0.22f)
                lineToRelative(-1.36f, -1.05f)
                lineToRelative(-1.36f, 1.05f)
                lineToRelative(-0.3f, -0.23f)
                lineToRelative(0.54f, -1.7f)
                lineToRelative(-1.38f, -0.77f)
                verticalLineToRelative(-0.38f)
                close()
                moveTo(18f, 18f)
                lineToRelative(-1.33f, 2f)
                horizontalLineToRelative(4.33f)
                verticalLineToRelative(4f)
                lineTo(3f, 24f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4.33f)
                lineToRelative(-1.33f, -2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6.54f)
                lineToRelative(2.46f, 3.7f)
                lineToRelative(2.46f, -3.7f)
                horizontalLineToRelative(6.54f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(11.97f, 10f)
                curveToRelative(2.93f, 0f, 4.93f, -0.49f, 6.0f, -0.85f)
                curveToRelative(-0.08f, 3.24f, -2.74f, 5.85f, -6.0f, 5.85f)
                reflectiveCurveToRelative(-5.92f, -2.61f, -6.0f, -5.85f)
                curveToRelative(1.07f, 0.36f, 3.07f, 0.85f, 6.0f, 0.85f)
                close()
            }
        }.also { _General = it}
