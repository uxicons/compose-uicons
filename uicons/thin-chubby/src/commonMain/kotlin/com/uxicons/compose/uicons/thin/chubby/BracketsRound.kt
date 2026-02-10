package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketsRound: ImageVector? = null

val Icons.Tc.BracketsRound: ImageVector
    get() = _BracketsRound ?: UXIcon(name = "BracketsRound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.02f, 12.01f)
                curveToRelative(0f, 5.44f, 1.44f, 8.54f, 4.66f, 10.04f)
                curveToRelative(0.25f, 0.12f, 0.36f, 0.41f, 0.24f, 0.66f)
                curveToRelative(-0.12f, 0.25f, -0.42f, 0.36f, -0.66f, 0.24f)
                curveToRelative(-3.57f, -1.66f, -5.23f, -5.14f, -5.23f, -10.95f)
                reflectiveCurveToRelative(1.67f, -9.3f, 5.27f, -10.96f)
                curveToRelative(0.25f, -0.12f, 0.55f, -0.01f, 0.66f, 0.24f)
                curveToRelative(0.12f, 0.25f, 0.01f, 0.55f, -0.24f, 0.66f)
                curveToRelative(-3.24f, 1.49f, -4.69f, 4.59f, -4.69f, 10.05f)
                close()
                moveTo(17.71f, 1.05f)
                curveToRelative(-0.25f, -0.12f, -0.55f, -0.01f, -0.66f, 0.24f)
                curveToRelative(-0.12f, 0.25f, -0.01f, 0.55f, 0.24f, 0.66f)
                curveToRelative(3.24f, 1.5f, 4.69f, 4.6f, 4.69f, 10.05f)
                reflectiveCurveToRelative(-1.44f, 8.54f, -4.66f, 10.04f)
                curveToRelative(-0.25f, 0.12f, -0.36f, 0.41f, -0.24f, 0.66f)
                curveToRelative(0.12f, 0.25f, 0.42f, 0.36f, 0.66f, 0.24f)
                curveToRelative(3.57f, -1.66f, 5.23f, -5.14f, 5.23f, -10.95f)
                reflectiveCurveToRelative(-1.67f, -9.3f, -5.27f, -10.96f)
                close()
            }
        }.also { _BracketsRound = it}
