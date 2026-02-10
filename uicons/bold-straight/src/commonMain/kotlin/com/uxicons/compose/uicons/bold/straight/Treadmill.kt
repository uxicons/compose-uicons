package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Treadmill: ImageVector? = null

val Icons.Bs.Treadmill: ImageVector
    get() = _Treadmill ?: UXIcon(name = "Treadmill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.09f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(4.43f, 9f)
                horizontalLineToRelative(1.34f)
                lineToRelative(-0.65f, 1.58f)
                curveToRelative(-0.52f, 1.09f, -0.18f, 2.44f, 0.86f, 3.35f)
                lineToRelative(3.1f, 2.74f)
                verticalLineToRelative(3.32f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.68f)
                lineToRelative(-3.22f, -2.85f)
                lineToRelative(0.93f, -2.27f)
                lineToRelative(1.5f, 1.79f)
                horizontalLineToRelative(3.7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.3f)
                lineToRelative(-1.15f, -1.38f)
                curveToRelative(-0.86f, -1.03f, -2.12f, -1.62f, -3.46f, -1.62f)
                lineTo(2.64f, 6.0f)
                lineToRelative(-2.08f, 3.87f)
                lineToRelative(2.64f, 1.42f)
                lineToRelative(1.23f, -2.29f)
                close()
                moveTo(3.52f, 14f)
                lineTo(1f, 14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.09f)
                lineToRelative(0.09f, -0.23f)
                lineToRelative(-1.52f, -1.34f)
                curveToRelative(-0.48f, -0.42f, -0.86f, -0.91f, -1.15f, -1.43f)
                close()
                moveTo(17.0f, 9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.56f)
                lineToRelative(-3.13f, 9f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(19.57f)
                lineToRelative(4.43f, -12.75f)
                verticalLineToRelative(-2.25f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.also { _Treadmill = it}
