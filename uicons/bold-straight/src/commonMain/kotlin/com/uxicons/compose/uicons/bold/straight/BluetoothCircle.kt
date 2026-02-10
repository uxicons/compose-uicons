package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothCircle: ImageVector? = null

val Icons.Bs.BluetoothCircle: ImageVector
    get() = _BluetoothCircle ?: UXIcon(name = "BluetoothCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(12.51f, 4f)
                horizontalLineToRelative(-1.51f)
                verticalLineToRelative(5.41f)
                lineToRelative(-2.58f, -2.39f)
                lineToRelative(-1.37f, 1.46f)
                lineToRelative(3.75f, 3.51f)
                lineToRelative(-3.79f, 3.54f)
                lineToRelative(1.36f, 1.46f)
                lineToRelative(2.62f, -2.44f)
                lineToRelative(0.02f, 5.46f)
                horizontalLineToRelative(1.56f)
                lineToRelative(4.91f, -4.49f)
                lineToRelative(-3.75f, -3.52f)
                lineToRelative(3.76f, -3.5f)
                lineToRelative(-4.97f, -4.49f)
                close()
                moveTo(14.53f, 15.49f)
                lineToRelative(-1.54f, 1.4f)
                lineToRelative(-0.01f, -2.85f)
                lineToRelative(1.54f, 1.45f)
                close()
                moveTo(13.0f, 9.96f)
                verticalLineToRelative(-2.86f)
                lineToRelative(1.52f, 1.41f)
                lineToRelative(-1.52f, 1.45f)
                close()
            }
        }.also { _BluetoothCircle = it}
