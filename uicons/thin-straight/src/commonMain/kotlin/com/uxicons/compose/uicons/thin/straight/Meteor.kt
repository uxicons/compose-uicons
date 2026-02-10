package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meteor: ImageVector? = null

val Icons.Ts.Meteor: ImageVector
    get() = _Meteor ?: UXIcon(name = "Meteor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 18f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(9.5f, 12f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(9.17f, 24.0f)
                curveToRelative(-2.35f, 0f, -4.7f, -0.89f, -6.49f, -2.68f)
                curveToRelative(-3.58f, -3.58f, -3.58f, -9.4f, 0f, -12.97f)
                curveTo(6.11f, 4.92f, 14.93f, 1.2f, 15.31f, 1.04f)
                lineToRelative(0.69f, -0.29f)
                lineTo(16f, 3.71f)
                lineTo(24.04f, -0.03f)
                lineToRelative(-3.75f, 8.03f)
                horizontalLineToRelative(2.95f)
                lineToRelative(-0.29f, 0.69f)
                curveToRelative(-0.16f, 0.37f, -3.86f, 9.2f, -7.28f, 12.62f)
                curveToRelative(-1.79f, 1.79f, -4.14f, 2.68f, -6.49f, 2.68f)
                close()
                moveTo(15f, 2.26f)
                curveToRelative(-2.17f, 0.96f, -8.87f, 4.04f, -11.61f, 6.78f)
                curveTo(0.21f, 12.23f, 0.21f, 17.42f, 3.39f, 20.61f)
                curveToRelative(3.19f, 3.19f, 8.38f, 3.19f, 11.56f, 0f)
                curveToRelative(2.74f, -2.74f, 5.81f, -9.43f, 6.77f, -11.61f)
                horizontalLineToRelative(-3.01f)
                lineToRelative(3.25f, -6.97f)
                lineToRelative(-6.96f, 3.25f)
                lineTo(15f, 2.26f)
                close()
            }
        }.also { _Meteor = it}
