package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallUp: ImageVector? = null

val Icons.Tr.AngleDoubleSmallUp: ImageVector
    get() = _AngleDoubleSmallUp ?: UXIcon(name = "AngleDoubleSmallUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 18f)
                curveToRelative(-0.12f, 0f, -0.24f, -0.04f, -0.34f, -0.13f)
                lineToRelative(-6.16f, -5.69f)
                lineToRelative(-6.16f, 5.69f)
                curveToRelative(-0.2f, 0.19f, -0.52f, 0.17f, -0.71f, -0.03f)
                curveToRelative(-0.19f, -0.2f, -0.17f, -0.52f, 0.03f, -0.71f)
                lineToRelative(6.5f, -6f)
                curveToRelative(0.19f, -0.18f, 0.49f, -0.18f, 0.68f, 0f)
                lineToRelative(6.5f, 6f)
                curveToRelative(0.2f, 0.19f, 0.22f, 0.5f, 0.03f, 0.71f)
                curveToRelative(-0.1f, 0.11f, -0.23f, 0.16f, -0.37f, 0.16f)
                close()
                moveTo(18.86f, 11.84f)
                curveToRelative(0.19f, -0.2f, 0.18f, -0.52f, -0.02f, -0.71f)
                lineToRelative(-4.42f, -4.13f)
                curveToRelative(-1.29f, -1.29f, -3.56f, -1.28f, -4.84f, -0.01f)
                lineToRelative(-4.43f, 4.14f)
                curveToRelative(-0.2f, 0.19f, -0.21f, 0.51f, -0.02f, 0.71f)
                curveToRelative(0.19f, 0.2f, 0.5f, 0.21f, 0.71f, 0.02f)
                lineToRelative(4.44f, -4.15f)
                curveToRelative(0.92f, -0.92f, 2.5f, -0.93f, 3.44f, 0.01f)
                lineToRelative(4.43f, 4.14f)
                curveToRelative(0.1f, 0.09f, 0.22f, 0.14f, 0.34f, 0.14f)
                curveToRelative(0.13f, 0f, 0.27f, -0.05f, 0.36f, -0.16f)
                close()
            }
        }.also { _AngleDoubleSmallUp = it}
