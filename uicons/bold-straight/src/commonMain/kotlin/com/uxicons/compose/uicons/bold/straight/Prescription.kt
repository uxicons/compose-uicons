package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Prescription: ImageVector? = null

val Icons.Bs.Prescription: ImageVector
    get() = _Prescription ?: UXIcon(name = "Prescription") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.14f, 18.66f)
                lineToRelative(3.44f, -5.66f)
                horizontalLineToRelative(-3.47f)
                lineToRelative(-1.76f, 2.89f)
                lineToRelative(-2.03f, -3.15f)
                curveToRelative(2.7f, -0.79f, 4.68f, -3.29f, 4.68f, -6.24f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(4.93f)
                lineToRelative(3.71f, 5.7f)
                lineToRelative(-3.23f, 5.3f)
                horizontalLineToRelative(3.47f)
                lineToRelative(1.55f, -2.55f)
                lineToRelative(1.66f, 2.55f)
                horizontalLineToRelative(3.5f)
                lineToRelative(-3.45f, -5.34f)
                close()
                moveTo(6f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineTo(3.5f)
                close()
            }
        }.also { _Prescription = it}
