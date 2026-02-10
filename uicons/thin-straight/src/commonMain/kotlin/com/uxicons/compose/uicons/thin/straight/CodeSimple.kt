package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeSimple: ImageVector? = null

val Icons.Ts.CodeSimple: ImageVector
    get() = _CodeSimple ?: UXIcon(name = "CodeSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.58f, 21.42f)
                lineTo(0.62f, 13.46f)
                curveToRelative(-0.38f, -0.38f, -0.59f, -0.88f, -0.59f, -1.42f)
                reflectiveCurveToRelative(0.21f, -1.04f, 0.59f, -1.41f)
                lineTo(8.63f, 2.63f)
                lineToRelative(0.71f, 0.71f)
                lineTo(1.33f, 11.34f)
                curveToRelative(-0.19f, 0.19f, -0.29f, 0.44f, -0.29f, 0.71f)
                reflectiveCurveToRelative(0.1f, 0.52f, 0.29f, 0.71f)
                lineToRelative(7.96f, 7.96f)
                lineToRelative(-0.71f, 0.71f)
                close()
                moveTo(23.38f, 13.46f)
                curveToRelative(0.38f, -0.38f, 0.59f, -0.88f, 0.59f, -1.42f)
                reflectiveCurveToRelative(-0.21f, -1.04f, -0.59f, -1.41f)
                lineTo(15.37f, 2.63f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(8.01f, 8.01f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                reflectiveCurveToRelative(-0.1f, 0.52f, -0.29f, 0.71f)
                lineToRelative(-7.96f, 7.96f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(7.96f, -7.96f)
                close()
            }
        }.also { _CodeSimple = it}
