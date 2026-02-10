package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Goalkeeper: ImageVector? = null

val Icons.Bs.Goalkeeper: ImageVector
    get() = _Goalkeeper ?: UXIcon(name = "Goalkeeper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 15.25f)
                verticalLineToRelative(6.75f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.25f)
                lineToRelative(-2.77f, -2.08f)
                lineToRelative(-0.74f, 0.47f)
                lineToRelative(1.51f, 2.43f)
                verticalLineToRelative(6.43f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.57f)
                lineToRelative(-4.95f, -7.99f)
                lineToRelative(-2.22f, 3.56f)
                horizontalLineToRelative(-4.83f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.17f)
                lineToRelative(1.35f, -2.16f)
                curveToRelative(0.6f, -0.97f, 1.45f, -1.76f, 2.46f, -2.29f)
                lineToRelative(6.65f, -3.55f)
                horizontalLineToRelative(5.38f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.62f)
                lineToRelative(-2.62f, 1.4f)
                lineToRelative(2.04f, 3.2f)
                close()
                moveTo(10.0f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(2f, 7f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _Goalkeeper = it}
