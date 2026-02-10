package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Prescription: ImageVector? = null

val Icons.Ts.Prescription: ImageVector
    get() = _Prescription ?: UXIcon(name = "Prescription") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 13f)
                horizontalLineToRelative(-1.19f)
                lineToRelative(-2.96f, 4.58f)
                lineToRelative(-3.68f, -5.69f)
                curveToRelative(2.75f, -0.55f, 4.83f, -2.98f, 4.83f, -5.88f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(8.06f)
                lineToRelative(4.2f, 6.5f)
                lineToRelative(-3.55f, 5.5f)
                horizontalLineToRelative(1.19f)
                lineToRelative(2.96f, -4.58f)
                lineToRelative(2.96f, 4.58f)
                horizontalLineToRelative(1.19f)
                lineToRelative(-3.55f, -5.5f)
                lineToRelative(3.55f, -5.5f)
                close()
                moveTo(12f, 11f)
                lineTo(4f, 11f)
                lineTo(4f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6.5f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
            }
        }.also { _Prescription = it}
