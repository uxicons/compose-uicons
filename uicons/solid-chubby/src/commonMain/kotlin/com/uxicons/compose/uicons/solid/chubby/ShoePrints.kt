package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoePrints: ImageVector? = null

val Icons.Sc.ShoePrints: ImageVector
    get() = _ShoePrints ?: UXIcon(name = "ShoePrints") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 7f)
                curveToRelative(-5f, 0f, -5f, 4.4f, -5f, 5.85f)
                curveToRelative(0f, 1.24f, 0.29f, 2.12f, 0.55f, 2.89f)
                curveToRelative(0.03f, 0.09f, 0.06f, 0.17f, 0.09f, 0.26f)
                horizontalLineToRelative(8.87f)
                curveToRelative(0.47f, -1.31f, 0.49f, -3.54f, 0.49f, -4f)
                curveToRelative(0f, -2.42f, -1.31f, -5f, -5f, -5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 23f)
                curveToRelative(1.82f, 0f, 4f, -0.87f, 4f, -5f)
                horizontalLineToRelative(-8f)
                curveToRelative(0f, 3.32f, 1.35f, 5f, 4f, 5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 1f)
                curveToRelative(-3.69f, 0f, -5f, 2.58f, -5f, 5f)
                curveToRelative(0f, 0.46f, 0.03f, 2.69f, 0.49f, 4f)
                horizontalLineToRelative(8.87f)
                curveToRelative(0.03f, -0.09f, 0.06f, -0.17f, 0.09f, -0.26f)
                curveToRelative(0.26f, -0.78f, 0.55f, -1.65f, 0.55f, -2.89f)
                curveToRelative(0f, -1.45f, 0f, -5.85f, -5f, -5.85f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 17f)
                curveToRelative(2.65f, 0f, 4f, -1.68f, 4f, -5f)
                horizontalLineToRelative(-8f)
                curveToRelative(0f, 4.13f, 2.17f, 5f, 4f, 5f)
                close()
            }
        }.also { _ShoePrints = it}
