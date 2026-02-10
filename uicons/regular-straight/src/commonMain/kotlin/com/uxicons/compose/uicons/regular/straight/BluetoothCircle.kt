package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothCircle: ImageVector? = null

val Icons.Rs.BluetoothCircle: ImageVector
    get() = _BluetoothCircle ?: UXIcon(name = "BluetoothCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(12.56f, 4f)
                horizontalLineToRelative(-1.56f)
                verticalLineToRelative(5.44f)
                lineToRelative(-2.58f, -2.42f)
                lineToRelative(-1.37f, 1.46f)
                lineToRelative(3.75f, 3.51f)
                lineToRelative(-3.79f, 3.54f)
                lineToRelative(1.36f, 1.46f)
                lineToRelative(2.63f, -2.46f)
                verticalLineToRelative(5.47f)
                horizontalLineToRelative(1.56f)
                lineToRelative(4.91f, -4.49f)
                lineToRelative(-3.75f, -3.52f)
                lineToRelative(3.75f, -3.5f)
                lineToRelative(-4.91f, -4.49f)
                close()
                moveTo(14.53f, 15.49f)
                lineToRelative(-1.53f, 1.4f)
                verticalLineToRelative(-2.83f)
                lineToRelative(1.53f, 1.43f)
                close()
                moveTo(13f, 9.93f)
                verticalLineToRelative(-2.82f)
                lineToRelative(1.53f, 1.4f)
                lineToRelative(-1.53f, 1.42f)
                close()
            }
        }.also { _BluetoothCircle = it}
