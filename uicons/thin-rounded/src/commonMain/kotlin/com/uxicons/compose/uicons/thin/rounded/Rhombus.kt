package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rhombus: ImageVector? = null

val Icons.Tr.Rhombus: ImageVector
    get() = _Rhombus ?: UXIcon(name = "Rhombus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.11f, 9.85f)
                lineTo(14.15f, 0.89f)
                curveToRelative(-1.15f, -1.15f, -3.15f, -1.15f, -4.3f, 0f)
                lineTo(0.89f, 9.85f)
                curveToRelative(-1.19f, 1.19f, -1.19f, 3.11f, 0f, 4.3f)
                lineToRelative(8.96f, 8.96f)
                curveToRelative(0.57f, 0.57f, 1.34f, 0.89f, 2.15f, 0.89f)
                reflectiveCurveToRelative(1.58f, -0.32f, 2.15f, -0.89f)
                lineToRelative(8.96f, -8.96f)
                curveToRelative(1.19f, -1.19f, 1.19f, -3.11f, 0f, -4.3f)
                close()
                moveTo(22.4f, 13.44f)
                lineToRelative(-8.96f, 8.96f)
                curveToRelative(-0.77f, 0.77f, -2.11f, 0.77f, -2.88f, 0f)
                lineTo(1.6f, 13.44f)
                curveToRelative(-0.8f, -0.8f, -0.8f, -2.09f, 0f, -2.88f)
                lineTo(10.56f, 1.6f)
                curveToRelative(0.77f, -0.77f, 2.11f, -0.77f, 2.88f, 0f)
                lineToRelative(8.96f, 8.96f)
                curveToRelative(0.8f, 0.8f, 0.8f, 2.09f, 0f, 2.88f)
                close()
            }
        }.also { _Rhombus = it}
