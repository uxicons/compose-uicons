package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppleDumbbell: ImageVector? = null

val Icons.Ss.AppleDumbbell: ImageVector
    get() = _AppleDumbbell ?: UXIcon(name = "AppleDumbbell") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                close()
                moveTo(8f, 12f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4.0f)
                curveToRelative(1.78f, -1.12f, 3.02f, -3.2f, 2.99f, -5.54f)
                curveToRelative(0f, -3.37f, -2.45f, -6.14f, -5.57f, -6.43f)
                curveToRelative(0.12f, -0.09f, 0.25f, -0.18f, 0.36f, -0.29f)
                curveToRelative(1.39f, -1.39f, 1.22f, -3.73f, 1.22f, -3.73f)
                reflectiveCurveToRelative(-2.34f, -0.17f, -3.73f, 1.22f)
                curveToRelative(-0.29f, 0.29f, -0.51f, 0.64f, -0.68f, 0.98f)
                curveToRelative(-0.26f, -0.88f, -0.59f, -1.58f, -0.84f, -2.03f)
                lineToRelative(-1.76f, 0.96f)
                curveToRelative(0.24f, 0.45f, 0.75f, 1.51f, 0.94f, 2.86f)
                horizontalLineToRelative(-0.81f)
                curveToRelative(-3.37f, 0f, -6.11f, 2.9f, -6.11f, 6.46f)
                curveToRelative(0f, 3.16f, 2.16f, 5.79f, 5f, 6.34f)
                verticalLineToRelative(-2.8f)
                horizontalLineToRelative(3f)
                close()
                moveTo(18f, 18f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(23f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _AppleDumbbell = it}
