package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mound: ImageVector? = null

val Icons.Rs.Mound: ImageVector
    get() = _Mound ?: UXIcon(name = "Mound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.32f, 10.13f)
                curveToRelative(-1.09f, -1.97f, -3.08f, -3.14f, -5.32f, -3.14f)
                reflectiveCurveToRelative(-4.24f, 1.17f, -5.32f, 3.14f)
                lineTo(0f, 22.22f)
                verticalLineToRelative(1.78f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1.78f)
                lineToRelative(-6.68f, -12.08f)
                close()
                moveTo(2.41f, 22f)
                lineToRelative(6.02f, -10.9f)
                curveToRelative(0.73f, -1.32f, 2.06f, -2.11f, 3.57f, -2.11f)
                reflectiveCurveToRelative(2.84f, 0.79f, 3.57f, 2.11f)
                lineToRelative(6.02f, 10.9f)
                horizontalLineTo(2.41f)
                close()
            }
        }.also { _Mound = it}
