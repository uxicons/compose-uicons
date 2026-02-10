package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notdef: ImageVector? = null

val Icons.Sc.Notdef: ImageVector
    get() = _Notdef ?: UXIcon(name = "Notdef") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 12f)
                curveToRelative(0f, 5.24f, -0.79f, 8.43f, -1.04f, 9.31f)
                lineToRelative(-6.72f, -9.31f)
                lineToRelative(6.72f, -9.31f)
                curveToRelative(0.25f, 0.88f, 1.04f, 4.07f, 1.04f, 9.31f)
                close()
                moveTo(12f, 10.29f)
                lineTo(18.29f, 1.58f)
                curveToRelative(-1.16f, -0.23f, -3.35f, -0.58f, -6.29f, -0.58f)
                reflectiveCurveToRelative(-5.14f, 0.34f, -6.29f, 0.58f)
                lineToRelative(6.29f, 8.71f)
                close()
                moveTo(4.04f, 2.69f)
                curveToRelative(-0.25f, 0.88f, -1.04f, 4.07f, -1.04f, 9.31f)
                reflectiveCurveToRelative(0.79f, 8.43f, 1.04f, 9.31f)
                lineToRelative(6.72f, -9.31f)
                close()
                moveTo(12f, 13.71f)
                lineTo(5.71f, 22.42f)
                curveToRelative(1.16f, 0.23f, 3.35f, 0.58f, 6.29f, 0.58f)
                reflectiveCurveToRelative(5.14f, -0.34f, 6.29f, -0.58f)
                close()
            }
        }.also { _Notdef = it}
