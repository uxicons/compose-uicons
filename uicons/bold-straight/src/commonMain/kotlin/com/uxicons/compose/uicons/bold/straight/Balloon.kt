package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Balloon: ImageVector? = null

val Icons.Bs.Balloon: ImageVector
    get() = _Balloon ?: UXIcon(name = "Balloon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 9.46f)
                curveTo(22f, 4.26f, 17.51f, 0.03f, 12f, 0.03f)
                reflectiveCurveTo(2f, 4.26f, 2f, 9.46f)
                curveToRelative(0f, 5.1f, 3.17f, 10.71f, 7.71f, 12.17f)
                curveToRelative(-0.44f, 0.74f, -0.71f, 1.62f, -0.71f, 2.36f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, -0.75f, -0.27f, -1.62f, -0.71f, -2.36f)
                curveToRelative(4.54f, -1.46f, 7.71f, -7.08f, 7.71f, -12.17f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.88f, 0f, -7f, -5.22f, -7f, -9.54f)
                curveToRelative(0f, -3.55f, 3.14f, -6.43f, 7f, -6.43f)
                reflectiveCurveToRelative(7f, 2.89f, 7f, 6.43f)
                curveToRelative(0f, 4.32f, -3.12f, 9.54f, -7f, 9.54f)
                close()
                moveTo(13.96f, 10f)
                horizontalLineToRelative(3.0f)
                curveToRelative(-0.16f, 2.32f, -1.26f, 4.35f, -2.29f, 5.5f)
                lineToRelative(-2.23f, -2.0f)
                curveToRelative(0.68f, -0.76f, 1.37f, -2.09f, 1.53f, -3.5f)
                close()
            }
        }.also { _Balloon = it}
