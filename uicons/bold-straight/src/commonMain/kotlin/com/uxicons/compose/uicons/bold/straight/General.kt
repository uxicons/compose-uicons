package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _General: ImageVector? = null

val Icons.Bs.General: ImageVector
    get() = _General ?: UXIcon(name = "General") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 6.05f)
                verticalLineToRelative(2.93f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                verticalLineToRelative(-2.96f)
                curveToRelative(1.22f, -0.56f, 1.96f, -1.39f, 1.96f, -2.52f)
                curveToRelative(0f, -2.5f, -3.58f, -3.5f, -8f, -3.5f)
                reflectiveCurveTo(3.96f, 1f, 3.96f, 3.5f)
                curveToRelative(0f, 1.16f, 0.78f, 1.99f, 2.04f, 2.55f)
                close()
                moveTo(15f, 8.98f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-1.2f)
                curveToRelative(0.83f, 0.12f, 1.82f, 0.21f, 3f, 0.21f)
                reflectiveCurveToRelative(2.17f, -0.09f, 3f, -0.21f)
                verticalLineToRelative(1.2f)
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
                moveTo(16.28f, 19f)
                lineToRelative(-1.4f, 2f)
                horizontalLineToRelative(6.12f)
                verticalLineToRelative(3f)
                lineTo(3f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6.12f)
                lineToRelative(-1.4f, -2f)
                lineTo(3f, 19f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6.28f)
                lineToRelative(2.72f, 3.88f)
                lineToRelative(2.72f, -3.88f)
                horizontalLineToRelative(6.28f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.72f)
                close()
            }
        }.also { _General = it}
