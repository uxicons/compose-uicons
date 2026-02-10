package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeSimple: ImageVector? = null

val Icons.Tr.CodeSimple: ImageVector
    get() = _CodeSimple ?: UXIcon(name = "CodeSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 22f)
                curveToRelative(-0.12f, 0f, -0.25f, -0.05f, -0.35f, -0.14f)
                lineTo(1.03f, 14.53f)
                curveToRelative(-1.37f, -1.37f, -1.37f, -3.59f, -0.01f, -4.96f)
                lineTo(8.65f, 2.14f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.19f, 0.71f, 0.01f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.52f, -0.01f, 0.71f)
                lineTo(1.73f, 10.29f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.76f)
                reflectiveCurveToRelative(0.26f, 1.29f, 0.73f, 1.77f)
                lineToRelative(7.61f, 7.32f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0.01f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.36f, 0.15f)
                close()
                moveTo(15.35f, 21.86f)
                lineToRelative(7.62f, -7.44f)
                curveToRelative(1.36f, -1.36f, 1.36f, -3.58f, -0.01f, -4.96f)
                lineTo(15.35f, 2.14f)
                curveToRelative(-0.2f, -0.19f, -0.52f, -0.19f, -0.71f, 0.01f)
                curveToRelative(-0.19f, 0.2f, -0.18f, 0.52f, 0.01f, 0.71f)
                lineToRelative(7.61f, 7.32f)
                curveToRelative(0.97f, 0.97f, 0.97f, 2.56f, 0.0f, 3.53f)
                lineToRelative(-7.62f, 7.43f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.36f, 0.15f)
                curveToRelative(0.13f, 0f, 0.25f, -0.05f, 0.35f, -0.14f)
                close()
            }
        }.also { _CodeSimple = it}
