package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _General: ImageVector? = null

val Icons.Rs.General: ImageVector
    get() = _General ?: UXIcon(name = "General") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 6.05f)
                verticalLineToRelative(2.95f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                verticalLineToRelative(-2.98f)
                curveToRelative(1.22f, -0.56f, 1.96f, -1.39f, 1.96f, -2.52f)
                curveToRelative(0f, -2.5f, -3.58f, -3.5f, -8f, -3.5f)
                reflectiveCurveTo(3.96f, 1f, 3.96f, 3.5f)
                curveToRelative(0f, 1.16f, 0.78f, 1.99f, 2.04f, 2.55f)
                close()
                moveTo(16f, 9f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-1.39f)
                curveToRelative(0.98f, 0.21f, 2.3f, 0.39f, 4f, 0.39f)
                reflectiveCurveToRelative(3.02f, -0.18f, 4f, -0.39f)
                verticalLineToRelative(1.39f)
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
                moveTo(15.54f, 18f)
                lineToRelative(-2.67f, 4f)
                horizontalLineToRelative(6.13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                lineTo(3f, 24f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.13f)
                lineToRelative(-2.67f, -4f)
                lineTo(3f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6.54f)
                lineToRelative(2.46f, 3.7f)
                lineToRelative(2.46f, -3.7f)
                horizontalLineToRelative(6.54f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5.46f)
                close()
            }
        }.also { _General = it}
