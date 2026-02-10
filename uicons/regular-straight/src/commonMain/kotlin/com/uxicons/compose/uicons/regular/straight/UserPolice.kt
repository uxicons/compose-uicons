package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPolice: ImageVector? = null

val Icons.Rs.UserPolice: ImageVector
    get() = _UserPolice ?: UXIcon(name = "UserPolice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.23f, -0.73f, -2.3f, -1.82f, -2.76f)
                lineToRelative(-5.18f, 5.18f)
                lineToRelative(-5.18f, -5.18f)
                curveToRelative(-1.09f, 0.46f, -1.82f, 1.53f, -1.82f, 2.76f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.35f, 1.59f, -4.35f, 3.88f, -4.87f)
                lineToRelative(0.54f, -0.12f)
                lineToRelative(4.58f, 4.58f)
                lineToRelative(4.58f, -4.58f)
                lineToRelative(0.54f, 0.12f)
                curveToRelative(2.28f, 0.52f, 3.88f, 2.53f, 3.88f, 4.87f)
                close()
                moveTo(6f, 6f)
                lineToRelative(-2f, -1f)
                verticalLineToRelative(-3f)
                lineTo(10.3f, 0.21f)
                curveToRelative(1.11f, -0.28f, 2.28f, -0.28f, 3.4f, 0f)
                lineToRelative(6.3f, 1.79f)
                verticalLineToRelative(3f)
                lineToRelative(-2f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-3f)
                close()
                moveTo(16f, 7.62f)
                curveToRelative(-0.98f, 0.21f, -2.31f, 0.39f, -4f, 0.39f)
                reflectiveCurveToRelative(-3.02f, -0.18f, -4f, -0.39f)
                verticalLineToRelative(1.39f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-1.39f)
                close()
                moveTo(10f, 4.07f)
                curveToRelative(0f, 1.33f, 1.55f, 2.21f, 2.0f, 2.44f)
                curveToRelative(0.45f, -0.18f, 2.0f, -0.92f, 2.0f, -2.44f)
                verticalLineToRelative(-1.45f)
                curveToRelative(0f, -0.19f, -0.12f, -0.36f, -0.3f, -0.42f)
                lineToRelative(-1.7f, -0.56f)
                lineToRelative(-1.7f, 0.56f)
                curveToRelative(-0.18f, 0.06f, -0.3f, 0.23f, -0.3f, 0.42f)
                verticalLineToRelative(1.45f)
                close()
            }
        }.also { _UserPolice = it}
