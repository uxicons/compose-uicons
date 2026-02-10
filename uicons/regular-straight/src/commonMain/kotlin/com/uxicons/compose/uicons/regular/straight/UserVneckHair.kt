package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVneckHair: ImageVector? = null

val Icons.Rs.UserVneckHair: ImageVector
    get() = _UserVneckHair ?: UXIcon(name = "UserVneckHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.51f, -1.12f, -2.76f, -2.57f, -2.97f)
                lineToRelative(-4.4f, 5.02f)
                lineToRelative(-4.43f, -5.02f)
                curveToRelative(-1.45f, 0.21f, -2.58f, 1.46f, -2.58f, 2.97f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(0.45f)
                lineToRelative(3.55f, 4.02f)
                lineToRelative(3.53f, -4.02f)
                horizontalLineToRelative(0.45f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(6f, 6f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(16f, 6f)
                curveToRelative(0f, -1.09f, -0.44f, -2.08f, -1.15f, -2.8f)
                curveToRelative(-1.12f, 2.29f, -3.44f, 3.8f, -6.06f, 3.8f)
                curveToRelative(-0.22f, 0f, -0.44f, -0.03f, -0.66f, -0.05f)
                curveToRelative(0.43f, 1.75f, 2.0f, 3.05f, 3.87f, 3.05f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                close()
                moveTo(8.16f, 4.95f)
                curveToRelative(0.21f, 0.03f, 0.42f, 0.05f, 0.63f, 0.05f)
                curveToRelative(1.9f, 0f, 3.58f, -1.12f, 4.34f, -2.82f)
                curveToRelative(-0.36f, -0.11f, -0.73f, -0.18f, -1.13f, -0.18f)
                curveToRelative(-1.84f, 0f, -3.38f, 1.26f, -3.84f, 2.95f)
                close()
            }
        }.also { _UserVneckHair = it}
